class Hamming {

    def distance(strand1, strand2) {
        if(strand1.size()!=strand2.size() ) {throw new ArithmeticException()}
        if(!(strand1 && strand2)){return 0}
        (0..(strand1.size()-1)).collect{ strand1[it]==strand2[it] ? 0:1}.sum()
    }

}