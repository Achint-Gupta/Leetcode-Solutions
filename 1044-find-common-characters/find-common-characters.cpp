class Solution {
public:
      vector<string> commonChars(vector<string>& words) {
        unordered_map<char, int> C;
        for (char ch : words[0]) {
            C[ch]++;
        }
        for (int i = 1; i < words.size(); i++) {
            unordered_map<char, int> temp;

            for (char ch : words[i]) {
                temp[ch]++;
            }

            for (auto &p : C) {
                p.second = min(p.second, temp[p.first]);
            }
        }
        vector<string> ans;

        for (auto &p : C) {
            for (int i = 0; i < p.second; i++) {
                ans.push_back(string(1, p.first));
            }
        }

        return ans;
    }
};