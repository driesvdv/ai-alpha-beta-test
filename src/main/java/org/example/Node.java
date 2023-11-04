package org.example;

import java.util.List;

public class Node{
    private int score;
    private List<Node> children;
    private int depth;
    private boolean pruned;

    public Node(int score, List<Node> children, int depth, boolean pruned) {
        this.score = score;
        this.children = children;
        this.depth = depth;
        this.pruned = false;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public boolean isPruned() {
        return pruned;
    }

    public void setPruned(boolean pruned) {
        this.pruned = pruned;
    }

    public String toString(){
        return "Score: " + this.score + " Depth: " + this.depth + " Pruned: " + this.pruned;
    }
}
