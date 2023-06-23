<?php

class Pieza
{
    private String $name;
    private int $maxWidth = 5;
    private int $maxHeight = 5;
    private array $formArray;
    private String $color;
    private bool $isCurrent;
    private int $positions;

    public function __construct($name, $formArray, $color, $positions)
    {
        $this->setName($name);
        $this->setFormArray($formArray);
        $this->setColor($color);
        $this->setPositions($positions);
        $this->setIsCurrent(true);
    }

    /**
     * Set the value of name
     *
     * @return  self
     */
    public function setName(String $name): void
    {
        $this->name = $name;
    }

    /**
     * Set the value of color
     *
     * @return  self
     */
    public function setColor(String $color): void
    {
        $this->color = $color;
    }

    /**
     * Display form by formArray
     *
     * @return  self
     */
    public function displayForm(): void
    {
        // Aquí generaríamos la matriz en canva
        // En base a los 0s y 1s que tenga la matriz obtenida
        // Recorremos cada fila de la forma
        foreach ($this->formArray as $row) {
            // Recorremos cada columna de la fila
            foreach ($row as $square) {
                if ($square === 1) {
                    // Agregamos la parte part.svg con su color correspondiente
                }
            }
        }
    }

    /**
     * Get the value of maxWidth
     */
    public function getMaxWidth()
    {
        return $this->maxWidth;
    }

    /**
     * Set the value of maxWidth
     *
     * @return  self
     */
    public function setMaxWidth(int $maxWidth): void
    {
        $this->maxWidth = $maxWidth;
    }

    /**
     * Set the value of maxHeight
     *
     * @return  self
     */
    public function setMaxHeight(int $maxHeight): void
    {
        $this->maxHeight = $maxHeight;
    }

    /**
     * Set the value of isCurrent
     *
     * @return  self
     */
    public function setIsCurrent(bool $isCurrent): void
    {
        $this->isCurrent = $isCurrent;
    }

    /**
     * Initialize formArray
     *
     * @return  self
     */
    public function setFormArray(array $formArray): void
    {
        $this->formArray = $formArray;
    }

    /**
     * Set the value of positions
     *
     * @return  self
     */
    public function setPositions($positions)
    {
        $this->positions = $positions;

        return $this;
    }
}
