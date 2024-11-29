package adventofcode.eventlistener

import kotlin.reflect.KClass

class EventManager {
    private val listeners: MutableMap<KClass<out Event>, MutableList<EventListener<Event>>> = HashMap()

    inline fun <reified T : Event> register(listener: EventListener<T>) {
        register(T::class, listener)
    }

    fun <T : Event> register(eventClass: KClass<out T>, listener: EventListener<T>) {
        val eventListeners = listeners.getOrPut(eventClass) { ArrayList() }
        eventListeners.add(listener as EventListener<Event>)
    }

    fun fireEvent(event: Event) {
        listeners[event::class]?.forEach { it.handle(event) }
    }
}