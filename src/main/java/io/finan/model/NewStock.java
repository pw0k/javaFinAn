package io.finan.model;

import lombok.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class NewStock extends Stock{
    String additionalProperty;
}
