
package test.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "helloMsg", namespace = "http://test/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "helloMsg", namespace = "http://test/")
public class HelloMsg {


}
