import models.candidate.Candidate;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileOutput {

    public void toFile(String uri, List<Candidate> candidates, StringBuilder stringBuilder) {
        candidates.forEach(candidate -> {
            toListString(candidate).forEach(
                    stringCandidate -> stringFactory(
                            stringCandidate,
                            stringBuilder
                    )
            );
        });

        stringBuilder.delete(
                stringBuilder.length() - 2,
                stringBuilder.length()
        );

        try {
            Files.write(
                    Paths.get(uri),
                    stringBuilder.toString().getBytes()
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    private List<String> toListString(Candidate candidate) {
        return Arrays.asList(
                candidate.getPerson().getName(),
                candidate.getPerson().getCpf(),
                candidate.getPerson().getBirthdate().toString(),
                candidate.getPerson().getGender().toString(),
                candidate.getWageExpectationMax().toString(),
                candidate.getWageExpectationMin().toString(),
                candidate.getExperience().getJob(),
                String.valueOf(candidate.getExperience().getCompanies()),
                candidate.getExperience().getCurrentJob(),
                candidate.getExperience().getSalary().toString(),
                String.valueOf(candidate.getExperience().getSkills()),
                candidate.getContact().getEmail(),
                candidate.getContact().getMobileNumber(),
                candidate.getContact().getPhoneNumber(),
                candidate.getAddress().getCity(),
                candidate.getAddress().getStreet(),
                candidate.getAddress().getNumber(),
                candidate.getAddress().getComplement(),
                candidate.getAddress().getNeighbourhood(),
                candidate.getAddress().getState()
        );
    }

    private void stringFactory(String candidate, StringBuilder stringBuilder) {
        stringBuilder.append(candidate).append(", ");
    }

}
