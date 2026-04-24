
// Trie (Prefix Tree)

class TrieNode {
    TrieNode[] children;
    boolean isEnd;

    public TrieNode() {
        children = new TrieNode[26];
        isEnd = false;
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }
    public void insert(String word) {
        TrieNode node = root;    
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }   
    public boolean search(String word) {
        TrieNode node = root;   
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }
        return node.isEnd;
    }
    public boolean startsWith(String prefix){
        TrieNode node = root;   
        for (char ch : prefix.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }
        return true;
    }
    public boolean delete(String word) {
        return deletehelper(root, word, 0);
    }
    private boolean deletehelper(TrieNode node, String word, int depth) {
        if(node == null) return false;
        if (depth == word.length()) {
            if (!node.isEnd) return false;
            node.isEnd = false;
            for(int i=0; i<26; i++){
                if(node.children[i]!=null)
                    return false;
            }
            return true;
        }
        int index = word.charAt(depth) - 'a';
        if(deletehelper(node.children[index],word,depth+1)){
            node.children[index] = null;
            return !node.isEnd && isEmpty(node);
        }
        return false;
    }
    private boolean isEmpty(TrieNode node){
        for(int i=0; i<26; i++){
            if(node.children[i] != null)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Trie t = new Trie();
        t.insert("apple");
        t.insert("app");

        System.out.println("Search apple: " + t.search("apple"));
        System.out.println("Search app: " + t.search("app"));
        System.out.println("StartsWith ap: " + t.startsWith("ap"));

        t.delete("apple");
        System.out.println("After deleting apple, search apple: " + t.search("apple"));
        System.out.println("After deleting apple, search app: " + t.search("app"));
    }
}
