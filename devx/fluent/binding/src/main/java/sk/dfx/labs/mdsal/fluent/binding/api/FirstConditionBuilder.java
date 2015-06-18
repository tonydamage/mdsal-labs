package sk.dfx.labs.mdsal.fluent.binding.api;

import com.google.common.base.Function;
import org.opendaylight.controller.md.sal.binding.api.DataObjectModification.ModificationType;
import org.opendaylight.yangtools.yang.binding.DataObject;

public interface FirstConditionBuilder<T extends DataObject> {


    AdditiotionalConditionBuilder<T> is(ModificationType type);

    <V> ValueConditionBuilder<T, V> valueOf(Function<T, V> valueFunction);

}
