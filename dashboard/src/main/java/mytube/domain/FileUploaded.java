package mytube.domain;

import java.util.*;
import lombok.Data;
import mytube.infra.AbstractEvent;

@Data
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private Long size;
    private Date createdTime;
    private String type;
    private String userId;
}
