package mytube.domain;

import java.util.*;
import lombok.*;
import mytube.domain.*;
import mytube.infra.AbstractEvent;

@Data
@ToString
public class FileIndexed extends AbstractEvent {

    private Long id;
    private Long field;
    private String keywords;
}
