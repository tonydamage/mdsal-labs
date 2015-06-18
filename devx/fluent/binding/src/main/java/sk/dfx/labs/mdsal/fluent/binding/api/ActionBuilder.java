package sk.dfx.labs.mdsal.fluent.binding.api;

import org.opendaylight.yangtools.yang.binding.DataObject;

public interface ActionBuilder<V extends DataObject> {


    void run(ValueOnlyAction<V> action);

    void run(PathAndValueAction<V> action);
}
