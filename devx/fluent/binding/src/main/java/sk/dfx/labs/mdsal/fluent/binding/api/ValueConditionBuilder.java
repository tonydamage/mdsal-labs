package sk.dfx.labs.mdsal.fluent.binding.api;

import org.opendaylight.yangtools.yang.binding.DataObject;


public interface ValueConditionBuilder<T extends DataObject, V> extends ActionBuilder<T> {

    ValueConditionBuilder<T, V> isIn(Iterable<? super V> values);

}
