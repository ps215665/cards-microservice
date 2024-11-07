package com.ps.cards.services;

import com.ps.cards.dto.CardsDto;

public interface CardsServiceInterface {

    /**
     *
     * @param mobileNumber - Mobile Number of the Customer
     */
    void createCard(String mobileNumber);

    /**
     *
     * @param mobileNumber - Input mobile Number
     *  @return Cards
     */
    CardsDto fetchCard(String mobileNumber);

    /**
     *
     * @param cardsDto - CardsDto Object
     * @return boolean
     */
    boolean updateCard(CardsDto cardsDto);

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return boolean
     */
    boolean deleteCard(String mobileNumber);

}
