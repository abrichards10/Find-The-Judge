# Find-The-Judge

NOTES
    In a town, there are N people
    Rumor has it one is secretly the judge
    if the judge exists
        - The judge trusts nobody
        - Everyone (except the judge) trusts the judge
        - There is ONE person that satisfies both properties
        trust - array of pairs:
            - trust[i] = [a, b] --> represents that 'a' trusts 'b'
        the number of people in the town is always between 1 & 1000

Create a temp array to store who is trustworthy

if the judge exists & is found,
    - return the label of the judge
else
    - return -1

N = num of people in town
    - trust = trust array
    - returns the Id of the judge or -1 if no judge is found
    - the values trust can have range from 1 to N
    - no two values can be in the same list
         so going through the first array,
             if the first value is already taken
             it can no longer be that value
         - no one with index 'a' can be the judge
         - those with index 'a' have to
