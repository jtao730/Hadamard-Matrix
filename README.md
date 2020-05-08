# Hadamard-Matrix
An n-by-n Hadamard matrix H(n) boolean matrix with the property that any two rows differ in exactly n/2 values. 
H(1) is a 1-by-1 matrix with the single element true, and for n>1, 
H(2n) is obtained by aligning four copies of H(n) in a large square, and then inverting all of the values in the lower right n-by-n copy.
Integer input in the command line in order to specific the dimensions of the matrix.

Sample: 
% java HadamardMatrix 2
T T
T F

% java HadamardMatrix 4 
T T T T 
T F T F 
T T F F 
T F F T 
