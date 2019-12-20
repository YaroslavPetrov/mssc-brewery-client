package petroff.jaros.msscbreweryclient.model.dto.in;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    private Long id;
    private String name;
    private String style;
    private Long upc;
}