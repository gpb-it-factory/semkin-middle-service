package org.vnsemkin.semkinmiddleservice.domain.models;

import org.springframework.lang.NonNull;

public record Customer(long id, long tgId, @NonNull String firstName, @NonNull String username, @NonNull String email,
                       @NonNull String passwordHash,
                       @NonNull String uuid, Account account) {
}