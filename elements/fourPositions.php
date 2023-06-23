<?php

require_once __DIR__ . '/pieza.php';

class TwoPositions extends Pieza
{

    function __construct($name, $formArray, $color)
    {
        parent::__construct($name, $formArray, $color, 2);
    }

    /**
     * 
     */
    public function rotate()
    {
        // Elaborar función en la que se permita rotar la matriz
        // De 
        /*  1   2   3  
            4   5   6
            7   8   9 */
        // A
        /*  7   4   1
            8   5   2
            9   6   3 */
    }
}
