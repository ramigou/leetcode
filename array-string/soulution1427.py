class Solution1427:
    def stringShift(self, s: str, shift: List[List[int]]) -> str:
        count = 0
        for sh in shift:
            [direction, amount] = sh
            if direction == 0:
                count -= amount
            else:
                count += amount

        if count == 0:
            return s

        s_length = len(s)
        count %= s_length

        left_s = s[:-count]
        right_s = s[-count:]

        return right_s + left_s