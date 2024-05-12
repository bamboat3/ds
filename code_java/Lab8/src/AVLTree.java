

public class AVLTree {

	//Height of the Tree
    public int height(Node T) {
        int lh, rh;
        if (T == null)
            return 0;
        if (T.left == null)
            lh = 0;
        else
            lh = 1 + T.left.ht;
        if (T.right == null)
            rh = 0;
        else
            rh = 1 + T.right.ht;

        if (lh > rh)
            return lh;

        return rh;
    }

    
    
    public Node rotateLeft(Node y) {
        Node x;
        x = y.right;

        y.right = x.left;
        x.left = y;
        
        // Update heights
        y.ht = height(y);
        x.ht = height(x);
        
        return x;
    }
    
  //Rotate Right
    public Node rotateRight(Node x) {
        Node y;
        y = x.left;

        x.left = y.right;
        y.right = x;
        x.ht = height(x);
        y.ht = height(y);
        return y;
    }

    //Apply the left right rotation
    public Node LR(Node T) {
        T.left = rotateLeft(T.left);
        T = rotateRight(T);
        return T;
    }
    
    public Node RR(Node y) {
        Node x = y.right;
        y.right = x.left;
        x.left = y;
        
        // Update heights
        y.ht = height(y);
        x.ht = height(x);
        
        return x;
    }
    
    public Node RL(Node y) {
        y.right = rotateRight(y.right);
        y = rotateLeft(y);
        return y;
    }
    
    public Node LL(Node x) {
        Node y = x.left;
        x.left = y.right;
        y.right = x;
        
        // Update heights
        x.ht = height(x);
        y.ht = height(y);
        
        return y;
    }

    //Find the balance factor
    public int BF(Node T) {
        int lh, rh;
        if (T == null)
            return 0;
        if (T.left == null)
            lh = 0;
        else
            lh = 1 + T.left.ht;
        if (T.right == null)
            rh = 0;
        else
            rh = 1 + T.right.ht;
        return lh - rh;
    }

    //Insert the new node in AVL
    public Node insert(Node T, int x) { // T is head node
        if (T == null) {
            T = new Node();
            T.data = x;
            T.left = null;
            T.right = null;
        } else if (x > T.data) { // insert in right subtree
            T.right = insert(T.right, x);
            if (BF(T) == -2)
                if (x > T.right.data)
                    T = RR(T);
                else
                    T = RL(T);
        } else if (x < T.data) {
            T.left = insert(T.left, x);
            if (BF(T) == 2)
                if (x < T.left.data)
                    T = LL(T);
                else
                    T = LR(T);
        }
        T.ht = height(T);
        return T;
    }

    //Delete from AVL Tree
    public Node delete(Node T, int x) {
        Node p;
        if (T == null) {
            return null;
        } else if (x > T.data) { // insert in right subtree
            T.right = delete(T.right, x);
            if (BF(T) == 2)
                if (BF(T.left) >= 0)
                    T = LL(T);
                else
                    T = LR(T);
        } else if (x < T.data) {
            T.left = delete(T.left, x);
            if (BF(T) == -2) // Rebalance during windup
                if (BF(T.right) <= 0)
                    T = RR(T);
                else
                    T = RL(T);
        } else {
            // data to be deleted is found
            if (T.right != null) {
                // delete its inorder successor
                p = T.right;
                while (p.left != null)
                    p = p.left;
                T.data = p.data;
                T.right = delete(T.right, p.data);
                if (BF(T) == 2) // Rebalance during windup
                    if (BF(T.left) >= 0)
                        T = LL(T);
                    else
                        T = LR(T);
            } else
                return T.left;
        }
        T.ht = height(T);
        return T;
    }//end delete
}//end class