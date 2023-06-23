<?php

require_once __DIR__ . '/pieza.php';

class PiezaI extends Pieza
{
    public function __construct()
    {
        parent::setName("I");
        parent::setFormArray(
            array(
                array(0, 0, 1, 0, 0),
                array(0, 0, 1, 0, 0),
                array(0, 0, 1, 0, 0),
                array(0, 0, 1, 0, 0),
                array(0, 0, 0, 0, 0)
            )
        );
        parent::setColor("cyan");
        parent::setIsCurrent(true);
    }
}
