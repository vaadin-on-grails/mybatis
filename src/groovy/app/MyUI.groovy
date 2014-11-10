package app

import com.app.mappers.Item
import com.app.mappers.ItemMapper
import com.vaadin.grails.Grails
import com.vaadin.server.VaadinRequest
import com.vaadin.ui.Label
import com.vaadin.ui.UI
import com.vaadin.ui.VerticalLayout

class MyUI extends UI {

    @Override
    protected void init(VaadinRequest request) {

        VerticalLayout layout = new VerticalLayout()

        ItemMapper itemMapper = Grails.get(ItemMapper)
        Item item = itemMapper.findById(1)

        Label label = new Label(item.label)
        layout.addComponent(label)

        setContent(layout)
    }
}
