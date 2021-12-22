# emp_SillySerpents
### Silly Serpents, Members: Jason Zhou, Vansh Saboo, Tiggy, Tiffany

## Tests Performed: 
  - Searched for random numbers in arrays varying in length multiple times
  - Searched for first, last, middle elements in arrays varying in length multiple times
  - Searched for total time to searchf for every element in arrays varying in length
  - Searched an array and its individual elements, comparing binsearch to linsearch
 
## Results: 
  - For random searches, random search is almost always faster
  - Bin Search is always faster for elements at the end of an arr or in the middle, but almost always slower for values at the beginning
  - Bin Search is always faster than lin search for total search time
  - Bin Search is almost always faster than lin search for individual element search time, with a few outliers

#### Total time to search for all elements
| SIZE | TRIALS | BinSearch Time for all Trials (milliseconds)  | LinSearch Time for all Trials (milliseconds) |
|-----------------|:-------------|:---------------:|---------------:|
| 200000         | 1        | 50      | 55685                  |
| 100000        | 1         | 31      | 10485                  |
| 10000       | 1         | 0      | 97                  |
| 1000     | 1         | 0      | 0                 |
| 100     | 1         | 0      | 0                |
| 10    | 1         | 0      |  0              |

#### Time to Search For a Random Element\* (\*1000 times)
| SIZE | # OF TRIALS | BinSearch Time for \*1000 repeated searches (milliseconds)  | LinSearch Time for \*1000 repeated searches (ms) |
| 10000000  | 8 |  4, 0, 0, 0, 0, 1, 0, 0 | 27196, 26290, 15715, 24262, 25041, 15339, 33712, 4884|
| 1000000   | 8 | 0, 0, 0, 0, 0, 0, 0, 1  | 2322, 172, 2093, 2859, 3072, 2713, 2542 |  
| 100000    | 8 | 0, 0, 0, 0, 0, 0, 0, 0 | 184, 118, 39, 0, 179, 94, 169, 278 | 
| 10000     | 8 | 1, 0, 0, 0, 0, 0,  0, 0 | 11, 4, 16, 15, 13, 16, 16, 25


  [Click Here for results](https://github.com/independence106/emp_SillySerpents/blob/main/results.txt)

## Conclusion: 
  - Bin Search is faster overall for the entire search space, and in general
  - Lin Search is only faster for beginning values of the array (THAT ARE IN THE ARRAY)
  - Bin Search is much faster than lin search
