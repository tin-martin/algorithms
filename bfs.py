class Graph:
  def __init__(self,V):
    self.V = V;
    self.graph = [[0 for i in range(self.V)] for i in range(self.V)]
    
  def addEdge(self,a,b,weight):
    self.graph[a][b] = weight;

    
  def BFS(self,src):
    isVisited = []
    queue = []
  
    queue.append(src)
    for v in range(self.V):
      isVisited.append(False)
  
    isVisited[src] = True
  
    while(len(queue) != 0):
      u = queue.pop(0)
      print(u,end=" ")
      for v in range(self.V):
        if(self.graph[u][v] > 0 and not isVisited[v]):
          queue.append(v)
          isVisited[v] = True

    '''
    How does BFS work?

    1. Add root node to back of queue. Mark root node as visited. 
    2
      a. Add all children of first vertex in queue to back of queue. 
      b. Mark all children as visited 
      c. Remove first node from queue
    - repeat step until queue is empty
    
    Recursive method:
    a. What is the repeating step?
    - select first vertex in queue and add all of their children to back of queue.           Mark all children as visited.
    b. What is the base case?
    - if queue is empty, end
    '''
    
  def rBFS(self, queue, visited):
    if(len(queue) != 0):
      u = queue.pop(0)
      print(u,end=" ")
      for v in range(self.V):
        #selects child
        if(self.graph[u][v] > 0 and not (v in visited)):
          #adds child to end of queue 
          queue.append(v)
          #marks child as visited
          visited.append(v)
      self.rBFS(queue,visited)
    
if __name__ == "__main__":
  a = [1,2,3,4,5]

  g = Graph(5)
  g.addEdge(0, 1, 10)
  g.addEdge(0, 2, 3)
  g.addEdge(1, 3, 2)
  g.addEdge(1, 2, 2)
  g.addEdge(2, 1, 4)
  g.addEdge(2, 3, 8)
  g.addEdge(2, 4, 2)
  g.addEdge(3, 4, 7)
  g.addEdge(4, 3, 9)

  g.BFS(0)
  print()

  queue = [0]
  visited = []
  g.rBFS(queue,visited)
  
  
  
