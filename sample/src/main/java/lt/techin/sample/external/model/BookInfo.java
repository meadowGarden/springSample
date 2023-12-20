package lt.techin.sample.external.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class BookInfo {

    @JsonProperty("first_publish_year")
    private int firstPublishYear;

    private String title;

    @JsonProperty("author_name")
    private String authorName;

    @JsonProperty("author_key")
    private String authorKey;

    @JsonProperty("subject")
    private List<String> tags;

}
