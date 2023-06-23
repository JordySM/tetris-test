<?php

require_once __DIR__ . '/pieza.php';

class OnePosition extends Pieza
{
    function __construct($name, $formArray, $color)
    {
        parent::__construct($name, $formArray, $color, 1);
    }
}
