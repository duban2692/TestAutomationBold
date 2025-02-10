package bold.co.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InformationData {

  private String fullName;
  private String email;
  private String currentAddress;
  private String permanentAddress;
}
