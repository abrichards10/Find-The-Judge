# Find-The-Judge

/* NOTES
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
     */
