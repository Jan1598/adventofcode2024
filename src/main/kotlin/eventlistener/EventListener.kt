package adventofcode.eventlistener

interface EventListener<T : Event> {
    fun handle(event: T)
}