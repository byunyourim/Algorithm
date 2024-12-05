/*
y 값을 기준으로 내림차순 정렬
y 값이 같으면 x값을 기준으로 오름차순 정렬

*/
import java.util.*;
class Solution {
    
    static class Node {
        int x;
        int y ;
        int value;
        Node left;
        Node right;
        
        Node (int x, int y, int value) {
            this.x = x;
            this.y = y;
            this.value = value;
        }
    }
    
    static List<Integer> preorderList = new ArrayList<>();
    static List<Integer> postorderList = new ArrayList<>();
    public int[][] solution(int[][] nodeinfo) {
        // 1. 노드 정보를 리스트로 반환
        List<Node> nodes = new ArrayList<>();
        for (int i = 0; i < nodeinfo.length; i++) {
            nodes.add(new Node(nodeinfo[i][0], nodeinfo[i][1], i + 1));
        }
        
        // 2. 노드 정렬 1) y 내림차순 -> x 오름차순
        nodes.sort((a, b) -> {
            if (a.y == b.y) return a.x - b.x;
            return b.y - a.y;
        });
        
        // 3. 트리 구성
        Node root = nodes.get(0);
        for (int i = 1; i < nodes.size(); i++) {
            insertNode(root, nodes.get(i));
        }
        
        // 4. 전위 순회, 후위 순회
        preorder(root);
        postorder(root);
        
        // 5. 결과 
        int[][] answer = new int[2][nodeinfo.length];
        for (int i = 0; i < nodeinfo.length; i++) {
            answer[0][i] = preorderList.get(i);
            answer[1][i] = postorderList.get(i);
        }
        
        return answer;
    }
    
    private void insertNode(Node parent, Node child) {
        if (child.x < parent.x) {
            if (parent.left == null) parent.left = child;
            else insertNode(parent.left, child);
        } else {
            if (parent.right == null) parent.right = child;
            else insertNode(parent.right, child);
        }
    }
    
    private void preorder(Node node) {
        if (node == null) return;
        preorderList.add(node.value);
        preorder(node.left);1) y 내림차순 -> x 오름차순
        preorder(node.right);
    }
    
    private void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        postorderList.add(node.value);
    }
}
