package hello.proxy.pureproxy.decorator.code;

/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-03        koiw1       최초 생성
 */
public class TestDecorator implements Component {

    Component component;

    public TestDecorator(Component component) {
        this.component = component;
    }

    @Override
    public String operation() {

        System.out.println("TEST 데코 호출");

        return null ;
    }
}
