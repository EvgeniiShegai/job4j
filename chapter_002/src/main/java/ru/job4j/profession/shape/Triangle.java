package ru.job4j.profession.shape;

/**
 * @author Evgenii Shegai (34shegai@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Triangle implements Shape {

    @Override
    public String draw() {
        StringBuilder str = new StringBuilder();
        str.append("  *  ");
        str.append(" * * ");
        str.append("* * *");
        return str.toString();
    }
}
