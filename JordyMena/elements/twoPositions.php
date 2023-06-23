<?php

require_once __DIR__ . '/pieza.php';

class TwoPositions extends Pieza
{
    private array $positionOne;
    private array $positionTwo;
    private bool $isCurrentPositionOne;

    function __construct($name, $formArrayOne, $formArrayTwo, $color)
    {
        parent::__construct($name, $formArrayOne, $color, 2);
        $this->setPositionOne($formArrayOne);
        $this->setPositionTwo($formArrayTwo);
        $this->setIsCurrentPositionOne(true);
    }

    // Determinamos cuál va a ser la primera posición
    protected function setPositionOne(array $formArray): void
    {
        $this->setPositionOne($formArray);
    }

    /**
     * Determina cuál será la segunda posición
     *
     * @return  self
     */
    public function setPositionTwo(array $positionTwo): void
    {
        $this->positionTwo = $positionTwo;
    }

    /**
     * Set the value of isCurrentPositionOne
     *
     * @return  self
     */
    public function setIsCurrentPositionOne($isCurrentPositionOne)
    {
        $this->isCurrentPositionOne = $isCurrentPositionOne;

        return $this;
    }

    /**
     * 
     */
    public function rotate()
    {
        if ($this->getIsCurrentPositionOne()) {
            $this->setIsCurrentPositionOne(false);
            return $this->getPositionTwo();
        } else {
            $this->setIsCurrentPositionOne(true);
            return $this->getPositionOne();
        }
    }

    /**
     * Get the value of isCurrentPositionOne
     */
    public function getIsCurrentPositionOne()
    {
        return $this->isCurrentPositionOne;
    }

    /**
     * Get the value of positionOne
     */
    public function getPositionOne()
    {
        return $this->positionOne;
    }

    /**
     * Get the value of positionTwo
     */
    public function getPositionTwo()
    {
        return $this->positionTwo;
    }
}
