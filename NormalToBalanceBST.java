int data;

    Node right, left;

    Node(int item)

    {

        data = item;

        left = right = null;

    }

}*/



class GfG

{

    Node buildBalancedTree(Node root) 

    {

        //Add your code here.

        ArrayList<Node> list = new ArrayList<>();

        

        inorder(list,root);

        return createTree(list,0,list.size()-1);

        

    }

    

    void inorder(ArrayList<Node> list,Node root)

    {

        if(root == null)

        {

            return;

        }

        

        inorder(list,root.left);

        list.add(root);

        inorder(list,root.right);

    }

    

    Node createTree(ArrayList<Node>list,int l,int r)

    {

        if(l>r)

        {

            return null;

        }

        

        int mid=(l+r)/2;

        

        Node root=list.get(mid);

        root.left = createTree (list,l,mid-1);

        root.right=createTree (list,mid+1,r);

        

        return root;

    }
