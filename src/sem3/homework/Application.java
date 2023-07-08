package sem3.homework;
public class Application {
    public void start() {
        while(true) {
            try {
                String str = new sem3.homework.InputContact().input();
                Contact contact = new CreateContact().create(str);
                System.out.printf("Создан новый контакт: %s\n", contact);
                new WriteContact().write(contact);
                System.out.printf("Контакт [%s] упешно сохранен", contact);
                System.exit(0);
            } catch (RuntimeException e) {
                System.out.println(e);
            }
        }
    }
}
