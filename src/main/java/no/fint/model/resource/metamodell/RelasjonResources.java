// Built from tag v1.0.0-rc-2

package no.fint.model.resource.metamodell;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.Collection;
import java.util.List;

import lombok.NoArgsConstructor;
import no.fint.model.resource.AbstractCollectionResources;

@NoArgsConstructor
public class RelasjonResources extends AbstractCollectionResources<RelasjonResource> {

    public RelasjonResources(Collection<RelasjonResource> input) {
        super(input);
    }

    @JsonIgnore
    @Deprecated
    @Override
    public TypeReference<List<RelasjonResource>> getTypeReference() {
        return new TypeReference<List<RelasjonResource>>() {};
    }
}
