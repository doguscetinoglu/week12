package art.dborg.library_management.v1.dto.request.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookUpdateRequest {
    private long id;
    private String name;
    private int year;
    private int stock;
}
