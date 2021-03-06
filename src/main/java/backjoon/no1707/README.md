# 그래프 관련 내용 정리

<hr/>

## 이 문제의 포인트

* 기본적인 dfs 탐색 문제의 간단한 응용이다.
루트가 주어지지 않았고, 컴포넌트가 나뉠 수 있기 때문에 dfs 전체 탐색을 해야 한다.
* 가장 큰 포인트는 color[] 다. 단순히 다녀간 노드를 체크하는 것이 아니라, 
노드에 임의의 두 가지 색의 상태를 부여하면서 나중에 이분 그래프가 될 수 있는지
알아낼 수 있다.
* 위까지는 잘 쉽게 구현했지만 마지막 검사하는데 생각이 복잡했다. 단순하게 V+E번 복잡도로 계산해도
시간 안에 충분히 들어올 수 있는데, dfs, bfs로 또 해결하려하니 복잡했다.
dfs 검색으로 검사할 때 까다로웠던 점은 마지막 노드가 그 이전에 검색된 노드와 색이 같을 때이다.
이 경우 단순하게 visited배열을 사용하면 검사할 수 없다. 이미 방문했기 때문에 지나친다. 그렇다고 이
제약을 깨면 불변성이 깨지면서 버그가 생긴다. 일단 무방향 그래프 이기 때문에 무한루프가 생길 것이다.

<hr/>

###  dfs 검사의 해법

* 적다보니 정리가 되었다. visited[node]가 true일 때, 그냥 넘어가버리기 때문에 생기는 문제인데,
그냥 넘어가지 않고 color비교만 해주면 된다. 재귀로 넘기지 않고.
