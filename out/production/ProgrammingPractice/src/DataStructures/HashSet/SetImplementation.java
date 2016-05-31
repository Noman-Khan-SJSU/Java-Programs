package DataStructures.HashSet;

class SetImplementation {

    private Object[] obj = new Object[16];
    private int length=0;

    public boolean contains(Object o) {

        for (int i=0; i <=length; i++) {

            if (o.equals(obj[i]))
                return true;
        }
        return false;
    }

    public void add (Object o) {

        if (!contains(o)) {
            obj[length] = o;
            length++;
        }
    }

    public int size() {

        return length;
    }

    public void remove(Object o) {
        if (contains(o)) {
            for (int i=0; i <=length; i++) {
                if (o.equals(obj[i])) {
                    for (int j=i; j<length;j++)
                        obj[j] = obj[j + 1];
                }
            }
            length--;
        }
    }

}