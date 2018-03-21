// Built from tag v0.2.0

package no.fint.model.metamodell;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

import no.fint.model.metamodell.kompleksedatatyper.Dokumentasjon;
import no.fint.model.metamodell.kompleksedatatyper.Identifikator;
import no.fint.model.metamodell.kompleksedatatyper.Multiplisitet;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Relasjon implements FintMainObject {
    public enum Relasjonsnavn {
            KLASSE
    }

    @NonNull
    private List<Dokumentasjon> dokumentasjon;
    @NonNull
    private Identifikator id;
    @NonNull
    private List<Multiplisitet> multiplisitet;
    @NonNull
    private String navn;
}