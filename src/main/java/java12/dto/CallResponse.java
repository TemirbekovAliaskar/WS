package java12.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CallResponse {
    private String callerId;
    private String receiverId;
    private String status;
    private String sdpAnswer;
    private String[] iceCandidates;
}
