
// Segment Tree

public class SegmentTree {
    int tree[];
    int n;

    SegmentTree(int arr[]) {
        n = arr.length;
        tree = new int[4 * n];
        buildTree(arr, 0, n - 1, 0);
    }

    void buildTree(int arr[], int start, int end, int node) {
        if (start == end) {
            tree[node] = arr[start];
        } else {
            int mid = (start + end) / 2;

            buildTree(arr, start, mid, 2 * node + 1);
            buildTree(arr, mid + 1, end, 2 * node + 2);

            tree[node] = tree[2 * node + 1] + tree[2 * node + 2];
        }
    }

    int query(int node, int start, int end, int l, int r) {
        if (r < start || end < l)
            return 0;

        if (l <= start && end <= r)
            return tree[node];

        int mid = (start + end) / 2;

        int left = query(2 * node + 1, start, mid, l, r);
        int right = query(2 * node + 2, mid + 1, end, l, r);

        return left + right;
    }

    void update(int node, int start, int end, int idx, int val) {
        if (start == end) {
            tree[node] = val;
        } else {
            int mid = (start + end) / 2;

            if (idx <= mid) {
                update(2 * node + 1, start, mid, idx, val);
            } else {
                update(2 * node + 2, mid + 1, end, idx, val);
            }

            tree[node] = tree[2 * node + 1] + tree[2 * node + 2];
        }
    }
}

class Main1 {
    public static void main(String[] args) {
        int arr[] = {5, 3, 8, 6, 2, 7, 4, 1};

        SegmentTree st = new SegmentTree(arr);

        System.out.println("Sum of range (2, 6): " + st.query(0, 0, arr.length - 1, 2, 6));

        st.update(0, 0, arr.length - 1, 3, 10);

        System.out.println("Sum of range (2, 6) after update: " + st.query(0, 0, arr.length - 1, 2, 6));
    }
}