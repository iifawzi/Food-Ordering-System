package com.food.ordering.system.domain.publisher;

import com.food.ordering.system.domain.events.DomainEvent;

public interface DomainEventPublisher<T> extends DomainEvent {
    void publish(T domainEvent);
}
