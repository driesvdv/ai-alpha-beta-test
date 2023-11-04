package org.example;

public class Tree{
    private Node root;

    public void setRoot(Node root){
        this.root = root;
    }

    public Node getRoot(){
        return this.root;
    }

    public int prune(Node node, int alpha, int beta){
        boolean isMaximizing = node.getDepth() % 2 == 0;

        if(node.getChildren().isEmpty()){
            return node.getScore();
        }

        if (isMaximizing) {
            for (Node child : node.getChildren()){
                alpha = Math.max(alpha, prune(child, alpha, beta));
                if (beta <= alpha){
                    node.setPruned(true);
                    break;
                }
            }
            return alpha;
        }
        else {
            for (Node child : node.getChildren()){
                beta = Math.min(beta, prune(child, alpha, beta));
                if (beta <= alpha){
                    node.setPruned(true);
                    break;
                }
            }
            return beta;
        }
    }
}
