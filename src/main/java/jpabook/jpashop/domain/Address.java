package jpabook.jpashop.domain;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable //jpa의 내장타입이기 때문에 어딘가에 들어갈 수 있다를 표시
@Getter
public class Address {
    private String city;
    private String street;
    private String zipcode;
}
