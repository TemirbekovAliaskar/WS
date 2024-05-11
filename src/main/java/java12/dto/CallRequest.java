package java12.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CallRequest {

    private String callerId;
    private String receiverId;
    private String audioCodec;
    private String videoCodec;
    private String[] iceServers;
    private Map<String, Object> customData;
}
