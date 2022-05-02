	public void formatTree(Node root) {

        Queue<Node> currentLevel = new LinkedList<Node>();
        Queue<Node> nextLevel = new LinkedList<Node>();

        currentLevel.add(root);
		
        while (!currentLevel.isEmpty()) {
			System.out.println();
            Iterator<Node> iter = currentLevel.iterator();
            while (iter.hasNext()) {
                Node currenNode = iter.next();
                if (currenNode.left != null) {
                    nextLevel.add(currenNode.left);
                }
                if (currenNode.right != null) {
                    nextLevel.add(currenNode.right);
                }
                System.out.print(currenNode.data + " ");
            }
            currentLevel = nextLevel;
            nextLevel = new LinkedList<Node>();

        }
	}