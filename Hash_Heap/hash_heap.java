import java.util.LinkedList;

class test {
    public static void main(String[] args) {

    }

}
/*
class HashTable {
    LinkedList<Node>[] hash;
    int size = 0;

    public HashTable(int size) {
        this.size = size;
        this.hash = new LinkedList[size];
    }

    int getHash(String key) {
        return key.hashCode() % size;
    }

    void put(String key, String value) {
        int index = getHash(key);
        LinkedList<Node> list = hash[index];

        if (list == null) {
            list = new LinkedList<Node>();
            hash[index] = list;
        }

        Node node = search(list, key);

        if (node == null) {
            list.addLast(new Node(key,value));
        } else {
            node.setValue(value);
        }

    }

    public String get(String key) {
        int index = getHash(key);
        LinkedList<Node> list = hash[index];
        Node node = search(list,key);

        return node!=null? node.getValue() : "no data";
    }

    Node search(LinkedList<Node> list, String key) {
        if (list==null) return null;
        for (Node node : list) {
            if (node.key.equals(key))
                return node;
        }
        return null;
    }

    public void delete(String key) {
        int index = getHash(key);
        LinkedList<Node> list = hash[index];
        Node node = search(list,key);
        if (node != null) {
            System.out.println("delete!! : " + node.key + ", " + node.value);
            list.remove(node);
        } else {
            System.out.println("No data");
        }
    }

    class Node {
        String key;
        String value;
        public Node(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getValue() {
            return value;
        }
        public void setValue(String value) {
            this.value = value;
        }
    }
}
*/


/* Heap!
class Heap {
    private int[] arr;
    private int size = 0;

    Heap(int heapSize) {
        arr = new int[heapSize+1];
    }

    public void insert(int x) {
        arr[++size] = x;
        for (int i = size; i > 1; i = i/2) {
            if (arr[i/2] < arr[i])
                swap(arr,i/2,i);
            else
                break;
        }
    }

    public int delete() {
        if (size==0) return -1;
        int ret = arr[1]; // root 값 넣기
        arr[1] = arr[size];
        arr[size--] = 0;

        for(int i=1; i*2<=size;) {
            if (arr[i] > arr[i*2] && arr[i] > arr[i*2+1])
                break;
            else if (arr[i] < arr[i*2]) {
                swap(arr,i,i*2);
                i = i*2;
            } else {
                swap(arr,i,i*2+1);
                i = i*2+1;
            }
        }
        return ret;
    }

    public void printTree() {
        int totalLen = arr.length - 1; // 1부터 시작할거임
        int height = (int)log(totalLen) + 1;
        for (int i=1; i<=height; i++) {
            for (int h = 0; h < Math.pow(2,height-i)-1; h++) System.out.print("  ");
            for (int j = (int) Math.pow(2,i-1); j <Math.pow(2,i); j++) {
                if (j > size) break;
                if (arr[j] >= 10) System.out.print(arr[j]);
                else System.out.print(arr[j] + " ");

                for(int k = 0; k < Math.pow(2,height-i+1)-1; k++) {
                    System.out.print("  ");
                }
                if (i == 1) break;
            }

            System.out.println("");
        }
    }

    private double log(double x) {
        return Math.log(x) / Math.log(2);
    }

    private void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
*/