class Solution1165:
    def calculateTime(self, keyboard: str, word: str) -> int:
        key_dict = {}
        for idx, kb in enumerate(keyboard):
            key_dict[kb] = idx
        
        answer = 0
        curr = 0
        for w in word:
            answer += abs(curr - key_dict[w])
            curr = key_dict[w]

        return answer

        