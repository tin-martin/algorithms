import math
class Graph:
  def __init__(self,V):
    self.V = V
    self.graph = [[0 for v in range(self.V)] for v in range(self.V)]

  def addEdge(self,a,b,w):
    self.graph[a][b] = w
    
  '''
  Steps:
  1. Initialize:
    a. Set all distances as Infinity, except source node (distance is 0)

  ## DO STEP 2 V-1 TIMES: ##
  2. Update shortest distances
    b. For all edges u-v, shorten dist:
      - if weight of edge + dist[u] > dist[v] , dist[v] = graph[u][v] + dist[u]  
  
  3. Find negative weight cycles
    - repeat step 2: if any shorter distances are found, we know node v is caught in negative weight cycle; thus, node v's weight becomes -Inf
  '''
  def printSPT(self,dist):
    print("Vertex:"+"\t"+"Shortest Path to src: ")
    for v in range(self.V):
      print(str(v)+"\t"+str(dist[v]))
      
  def BellmanFord(self,src):
    #initialize: set all distances as Infinity, except source node (distance is 0)
    dist = [math.inf for i in range(self.V)]
    dist[src] = 0
    ## DO STEP 2 V-1 TIMES: ##
    for i in range(self.V-1):
     # For all edges u-v, relax
      for u in range(self.V):
        for v in range(self.V):
          if(self.graph[u][v] != 0):
             #if weight of edge + dist[u] < dist[v] , dist[v] = graph[u][v] + dist[u]  
            if(dist[u] + self.graph[u][v] < dist[v]):
              dist[v] = dist[u] + self.graph[u][v]

    '''
    Finding negative weight cycles:
    repeat step 2: if any shorter distances are found, we know node v is caught in       negative weight cycle; thus, node v's weight becomes -Inf
    '''
    for i in range(self.V-1):
     # For all edges u-v, relax
      for u in range(self.V):
        for v in range(self.V):
          if(self.graph[u][v] != 0):
            if(dist[u] + self.graph[u][v] < dist[v]):
              dist[v] = -math.inf
              
    self.printSPT(dist)

              

    

if __name__ == '__main__':
  g = Graph(3)
  g.addEdge(0,1,-21)#
  g.addEdge(1,2,-4)
  g.addEdge(0,2,-3)#
 
 
  g.BellmanFord(0)

  
  
   
