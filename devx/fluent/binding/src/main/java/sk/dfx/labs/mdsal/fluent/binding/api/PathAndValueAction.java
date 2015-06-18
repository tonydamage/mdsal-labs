package sk.dfx.labs.mdsal.fluent.binding.api;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;

public interface PathAndValueAction<T extends DataObject> {

    void perform(InstanceIdentifier<T> path, T data);

}
