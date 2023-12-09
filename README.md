# spring-framework-palyground

## ${pageContext.request.contextPath}
It will give the current project's base path, we can use this for create link and form action in view page

## Redirect in spring MVC

Redirect without any message to next view

```java
@PostMapping("/items/save")
public String saveItem(@ModelAttribute("item") Item item) {
    service.save(item);
    return "redirect:/items";
}
```

Passing some message to next view

```java
@PostMapping("/items/save")
public RedirectView saveItem(@ModelAttribute("item") Item item, RedirectAttributes ra) {
    service.save(item);
    RedirectView rv = new RedirectView("/items", true);
    ra.addFlashAttribute("message", "The item has been saved successfully.");
    return rv;
}
```
Note that the URL specified in the RedirectView constructor can be absolute, context relative or current request relative. If you specify the redirect URL like this:

```java
RedirectView rv = new RedirectView("/items");
```

Then it is relative to the web server root. If you want to use the redirect URL as relative to the application context path (context relative) then set the second flag to true:

```java
RedirectView rv = new RedirectView("/items", true);
```

Redirection view without ``RedirectView``

```java
@PostMapping("/items/save")
public String saveItem(@ModelAttribute("item") Item item, RedirectAttributes ra) {
    service.save(item);
    ra.addFlashAttribute("message", "The item has been saved successfully.");
    return "redirect:/item";
}
```