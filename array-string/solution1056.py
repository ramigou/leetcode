class Solution1056:
    def confusingNumber(self, n: int) -> bool:
        confusing_num_dict = { '0': 0, '1': 1, '6': 9, '8': 8, '9': 6 }

        rotated_num_list = []
        for char in str(n):
            if char not in confusing_num_dict: return False

            rotated_num_list.insert(0, confusing_num_dict[char])

        rotated_num = ''.join(str(x) for x in rotated_num_list)

        if n == int(rotated_num): return False

        return True
